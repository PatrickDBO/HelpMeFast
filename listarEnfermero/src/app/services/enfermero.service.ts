import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EnfermeroService {
url:string="http://localhost:5000/enfermeros";
  constructor(private http:HttpClient) { }

  listar()
  {
      return this.http.get<any>(this.url);
  }
}
