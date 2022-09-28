import { Component, OnInit } from '@angular/core';
import { InteresService } from 'src/app/service/interes.service';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-interes-dialogo',
  templateUrl: './interes-dialogo.component.html',
  styleUrls: ['./interes-dialogo.component.css']
})
export class InteresDialogoComponent implements OnInit {

  constructor(private interesService: InteresService,
    private dialogRef: MatDialogRef<InteresDialogoComponent>
  ) { }

  ngOnInit(): void {
  }

  confirmar(estado: boolean) {
    this.interesService.setConfirmaEliminacion(estado);
    this.dialogRef.close();
  }
}
