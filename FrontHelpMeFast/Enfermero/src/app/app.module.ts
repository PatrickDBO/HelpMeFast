import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatTableModule } from '@angular/material/table';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from'@angular/material/icon';
import { FormsModule } from '@angular/forms';
import { MatDialogModule } from '@angular/material/dialog';
import { EnfermeroComponent } from './page/enfermero/enfermero.component';
import { EnfermeroBuscarComponent } from './page/enfermero/enfermero-buscar/enfermero-buscar.component';
import { EnfermeroCreaeditaComponent } from './page/enfermero/enfermero-creaedita/enfermero-creaedita.component';
import { EnfermeroListarComponent } from './page/enfermero/enfermero-listar/enfermero-listar.component';
import { EnfermeroDialogoComponent } from './page/enfermero/enfermero-listar/enfermero-dialogo/enfermero-dialogo.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ComentariosComponent } from './page/comentarios/comentarios.component';
import { ComentariosDialogoComponent } from './page/comentarios/comentarios-listar/comentarios-dialogo/comentarios-dialogo.component';
import { ComentariosListarComponent } from './page/comentarios/comentarios-listar/comentarios-listar.component';
import { ComentariosBuscarComponent } from './page/comentarios/comentarios-buscar/comentarios-buscar.component';
import { ComentariosCreaeditaComponent } from './page/comentarios/comentarios-creaedita/comentarios-creaedita.component';

@NgModule({
  declarations: [
    AppComponent,
    EnfermeroComponent,
    EnfermeroBuscarComponent,
    EnfermeroCreaeditaComponent,
    EnfermeroListarComponent,
    EnfermeroDialogoComponent,
    ComentariosComponent,
    ComentariosDialogoComponent,
    ComentariosListarComponent,
    ComentariosBuscarComponent,
    ComentariosCreaeditaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatTableModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    FormsModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
