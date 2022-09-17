import { RouterModule } from '@angular/router';
import { MaterialModule } from './../shared/material.module';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './componets/footer/footer.component';
import { HeaderComponent } from './componets/header/header.component';
import { EnfermeroDetailComponent } from './componets/enfermero-detail/enfermero-detail.component';
import { EnfermeroTableComponent } from './componets/enfermero-table/enfermero-table.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import{MatTableModule} from '@angular/material/table';
import { EnfermeroComponent } from './page/enfermero/enfermero.component';
import { EnfermeroListarComponent } from './page/enfermero/enfermero-listar/enfermero-listar.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    EnfermeroDetailComponent,
    EnfermeroTableComponent,
    EnfermeroComponent,
    EnfermeroListarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule,
    RouterModule,
    MatTableModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
