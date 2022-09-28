import { Enfermero } from './../../../model/enfermero';
import { EnfermeroService } from 'src/app/services/enfermero.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-enfermero-buscar',
  templateUrl: './enfermero-buscar.component.html',
  styleUrls: ['./enfermero-buscar.component.css']
})
export class EnfermeroBuscarComponent implements OnInit {
textoBuscar: string = "";
  constructor(private eS: EnfermeroService) { }

  ngOnInit(): void {
  }
  buscar(e: any)
  {
    let array: Enfermero[] = [];
    this.eS.listar().subscribe(data => {
      data.forEach((element, index) => {
        if (element.nombreEnfermero.includes(e.target.value)) {
          array.push(data[index]);
        }
      });
      this.eS.setLista(array);
    })
  }
}
