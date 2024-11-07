import { Component } from '@angular/core';
import { CidadesService } from '../services/cidades-api.service';
import { HttpClientModule } from '@angular/common/http';
import { ICidade } from '../models/cidade.model';
import { ActivatedRoute,  Router } from '@angular/router';
import { FormBuilder, FormGroup, FormGroupDirective, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
 
 
@Component({
  selector: 'app-form-api',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [CidadesService],
  templateUrl: './form-api.component.html',
  styleUrl: './form-api.component.scss',
})

export class FormApiComponent { 

  form: FormGroup;

  minhaCidade: ICidade = {
    id:'',
    nome:'',
    pais:'',
  }
  
  
  constructor(
    private cidadesService : CidadesService, 
    private route: ActivatedRoute,
    private FormBuilder: FormBuilder
    ) {
      this.form = FormBuilder.group({
        nome: ['', Validators.required],
        pais: ['', Validators.required],
        populacao: [0, Validators.min(1000), Validators.max(10000)]
      })
      }
 
      ngOnInit() { 
        // CONFERIR CODIGO
        this.minhaCidade.id =
          this.route.snapshot.paramMap.get('id') ?? '0'
        ;
        console.log('id:', this.minhaCidade.id);
     
        if (this.minhaCidade.id) {
          this.cidadesService.read(this.minhaCidade.id).subscribe((cidade) => {
            console.log(cidade);
            this.minhaCidade = cidade;
            this.form.controls['nome'].setValue(cidade.nome);
            this.form.controls['pais'].setValue(cidade.pais);
            this.form.controls['populacao'].setValue(cidade.populacao);
          });
        }
      }

  formSubmit(){
    if(this.form.invalid){

    } else {
      if(this.minhaCidade.id){
        this.cidadesService.update({
          nome: this.form.controls['nome'].getRawValue(),
          pais: this.form.controls['pais'].getRawValue(),
          populacao: this.form.controls['populacao'].getRawValue(),
        }).subscribe(
          next => {
            console.log('foi editado')
          },
          error => {
            console.error('não foi editado')

          }
        )
      }
      else {

      }

    }

  }
}
 