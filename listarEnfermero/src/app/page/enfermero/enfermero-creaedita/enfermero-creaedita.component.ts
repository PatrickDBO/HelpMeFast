import { EnfermeroService } from 'src/app/services/enfermero.service';
import { Enfermero } from './../../../model/enfermero';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';

@Component({
  selector: 'app-enfermero-creaedita',
  templateUrl: './enfermero-creaedita.component.html',
  styleUrls: ['./enfermero-creaedita.component.css']
})
export class EnfermeroCreaeditaComponent implements OnInit {
  enfermero: Enfermero = new Enfermero();
  mensaje: string = "";
  edicion: boolean = false;
  id: number = 0;

  constructor(private enfermeroService: EnfermeroService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe((data: Params) => {
      this.id = data['id'];
      this.edicion = data['id'] != null;
      this.init();
    });
  }
  aceptar():void
  {
    if(this.enfermero.nombreEnfermero.length > 0 && this.enfermero.dniEnfermero > 0 && this.enfermero.edadEnfermero > 0
    && this.enfermero.numEnfermero > 0 && this.enfermero.correoEnfermero.length > 0 && this.enfermero.codEnfermero > 0 )
  {
    if(this.edicion)
    {
      this.enfermeroService.modificar(this.enfermero).subscribe(data => {
        this.enfermeroService.listar().subscribe(data => {
          this.enfermeroService.setLista(data);
        })
      })
    } else {
    this.enfermeroService.insertar(this.enfermero).subscribe(data => {
      this.enfermeroService.listar().subscribe(data => {
        this.enfermeroService.setLista(data);
      })
    })
  }
    this.router.navigate(['enfermeros']);
    } else {
    this.mensaje = "Complete los valores requeridos";
    }
  }

  init() {
    if (this.edicion) {
      this.enfermeroService.listarId(this.id).subscribe(data => {
        this.enfermero = data;
      })
    }
  }
}

