import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Marcacao } from '../models/marcacao';

@Injectable({
  providedIn: 'root'
})
export class MarcacoesService {


  marcacoesUrl:string= 'http://localhost:3000/marcacoes';
  marcacao: Array<Marcacao> = [];


  constructor(private http: HttpClient) {}

  //crud
getAll(): Observable<Marcacao[]> {
  return this.http.get<Marcacao[]>(this.marcacoesUrl);
}

getById(id: string): Observable<Marcacao> { //como escreve a string em JavaScript
  return this.http.get<Marcacao>(`${this.marcacoesUrl}/${id}`);
}

create(marcacao: Marcacao): Observable<Marcacao> {
  return this.http.post<Marcacao>(this.marcacoesUrl, marcacao);
}

update(marcacao: Marcacao): Observable<Marcacao> {
  return this.http.put<Marcacao>(`${this.marcacoesUrl}/${marcacao.id}`, marcacao);
}

delete(marcacao: Marcacao): Observable<Marcacao> {
  return this.http.delete<Marcacao>(`${this.marcacoesUrl}/${marcacao.id}`);
}
}

