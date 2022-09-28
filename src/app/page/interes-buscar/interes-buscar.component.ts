import { Component, OnInit } from '@angular/core';
import { Interes } from 'src/app/model/interes';
import { InteresService } from 'src/app/service/interes.service';

@Component({
  selector: 'app-interes-buscar',
  templateUrl: './interes-buscar.component.html',
  styleUrls: ['./interes-buscar.component.css']
})
export class InteresBuscarComponent implements OnInit {
  textoBuscar: string = ""
  constructor(private interesService: InteresService) { }

  ngOnInit(): void {
  }

  buscar(e: any) {
    let array: Interes[] = [];
    this.interesService.listar().subscribe(data => {
      data.forEach((element, index) => {
        if (element.medidaInteres.includes(e.target.value)) {
          array.push(data[index]);
        }
      });
      this.interesService.setLista(array);
    })
  }
}
