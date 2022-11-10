import { Component, OnInit } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';
import { ComentariosService } from 'src/app/services/comentarios.service';

@Component({
  selector: 'app-comentarios-dialogo',
  templateUrl: './comentarios-dialogo.component.html',
  styleUrls: ['./comentarios-dialogo.component.css']
})
export class ComentariosDialogoComponent implements OnInit {

  constructor(private comentariosService: ComentariosService,
    private dialogRef: MatDialogRef<ComentariosDialogoComponent>) { }

    ngOnInit(): void {  }
    confirmar(estado: boolean) {
      this.comentariosService.setConfirmaEliminacion(estado);
      this.dialogRef.close();
    }
  }
