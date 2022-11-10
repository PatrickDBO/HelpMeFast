import { ComentariosService } from './../../../services/comentarios.service';
import { Comentarios } from './../../../model/comentarios';
import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute, Params} from '@angular/router';

@Component({
  selector: 'app-comentarios-creaedita',
  templateUrl: './comentarios-creaedita.component.html',
  styleUrls: ['./comentarios-creaedita.component.css']
})
export class ComentariosCreaeditaComponent implements OnInit {
  comentario: Comentarios = new Comentarios();
  mensaje: string = "";
  edicion: boolean = false;
  id: number = 0;
  constructor(private comentarioService: ComentariosService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe((data: Params) => {
      this.id = data['id'];
      this.edicion = data['id'] != null;
      this.init();
    });
  }
  aceptar():void
  {
    if(this.comentario.Opinion.length > 0 && this.comentario.Calificacion > 0 )
  {
    if(this.edicion)
    {
      this.comentarioService.modificar(this.comentario).subscribe(data => {
        this.comentarioService.listar().subscribe(data => {
          this.comentarioService.setLista(data);
        })
      })
    } else {
    this.comentarioService.insertar(this.comentario).subscribe(data => {
      this.comentarioService.listar().subscribe(data => {
        this.comentarioService.setLista(data);
      })
    })
  }
    this.router.navigate(['comentarios']);
    } else {
    this.mensaje = "Complete los valores requeridos";
    }
  }

  init() {
    if (this.edicion) {
      this.comentarioService.listarId(this.id).subscribe(data => {
        this.comentario = data;
      })
    }
  }

}
