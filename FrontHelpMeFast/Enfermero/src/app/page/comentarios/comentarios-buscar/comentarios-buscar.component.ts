import { ComentariosService } from './../../../services/comentarios.service';
import { Comentarios } from './../../../model/comentarios';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comentarios-buscar',
  templateUrl: './comentarios-buscar.component.html',
  styleUrls: ['./comentarios-buscar.component.css']
})
export class ComentariosBuscarComponent implements OnInit {

  textoBuscar: string = ""
  constructor(private comentariosService: ComentariosService) { }


  ngOnInit(): void {
  }
  buscar(e: any) {
    let array:Comentarios[]=[];
    this.comentariosService.listar().subscribe(data => {
     data.forEach((element: { Opinion: string | any[]; }, index: string | number)=> {
       if (element.Opinion.includes(e.target.value))
       {
         array.push(data[index]);
       }
       this.comentariosService.setLista(array);
     });
    })
   }
}
