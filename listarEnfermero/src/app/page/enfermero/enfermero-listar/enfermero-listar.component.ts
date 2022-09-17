import { Component, OnInit } from '@angular/core';
import { Enfermero } from './../../../model/enfermero';
import { EnfermeroService } from 'src/app/services/enfermero.service';
import { MatTableDataSource } from '@angular/material/table'



@Component({
  selector: 'app-enfermero-listar',
  templateUrl: './enfermero-listar.component.html',
  styleUrls: ['./enfermero-listar.component.css']
})
export class EnfermeroListarComponent implements OnInit {
  dataSource: MatTableDataSource<Enfermero> = new MatTableDataSource();
  displayedColumns:string[]=['id','name','dni', 'edad', 'numero', 'email', 'CIP'];
  constructor(private eS: EnfermeroService) { }

  ngOnInit(): void
  {
    this.eS.listar().subscribe(data=>{
        this.dataSource = new MatTableDataSource(data);
    })
  }

}
