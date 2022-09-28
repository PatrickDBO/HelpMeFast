import { Component, OnInit } from '@angular/core';
import { Interes } from 'src/app/model/interes';
import { InteresService } from 'src/app/service/interes.service';
import { MatTableDataSource } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { InteresDialogoComponent } from '../interes-dialogo/interes-dialogo.component'; 
@Component({
  selector: 'app-interes-listar',
  templateUrl: './interes-listar.component.html',
  styleUrls: ['./interes-listar.component.css']
})
export class InteresListarComponent implements OnInit {
  dataSource: MatTableDataSource<Interes> = new MatTableDataSource();
  displayedColumns: string[] = ['id', 'medida', 'accion1','accion2'];
  private idMayor: number = 0;
  constructor(private ps: InteresService, private dialog: MatDialog) { }

  ngOnInit(): void {
    this.ps.listar().subscribe(data => {
      this.dataSource = new MatTableDataSource(data);
    })
    this.ps.getLista().subscribe(data => {
      this.dataSource = new MatTableDataSource(data);
    });
    this.ps.getConfirmaEliminacion().subscribe(data => {
      data == true ? this.eliminar(this.idMayor) : false;
    });
  }

  confirmar(id: number) {
    this.idMayor = id;
    this.dialog.open(InteresDialogoComponent);
  }

  eliminar(id: number) {
    this.ps.eliminar(id).subscribe(() => {
      this.ps.listar().subscribe(data => {
        this.ps.setLista(data);
      });
    });
  }
}
