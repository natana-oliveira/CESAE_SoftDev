import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { MinhaListaComponent } from './minha-lista/minha-lista.component';
import { FormularioCidadeTdComponent } from './formulario-cidade-td/formulario-cidade-td.component';

export const routes: Routes = [
  {
    path: 'primeira',
    title: 'Primeira Página',
    component: PrimeiraPaginaComponent,
  },
  {
    path: 'segunda',
    title: 'Segunda Página',
    component: SegundaPaginaComponent,
    children: [
      {
        path: 'aaa',
        title: 'Aaa | Segunda Página',
        component: SegundaAaaPaginaComponent,
      },
      {
        path: 'bbb',
        title: 'Bbb | Segunda Página',
        component: SegundaBbbPaginaComponent,
      },
    ],
  },
  {
    path: 'minha-lista',
    title: 'Minha Lista',
    component: MinhaListaComponent,
  },
  
  /*{
    path: 'formulario-cidade-td',
    title: 'Criar - Formulário Cidade (Template-driven forms)',
    component: FormularioCidadeTdComponent,
  },
  {
    path: 'formulario-cidade-td/:id',
    title: 'Editar - Formulário Cidade (Template-driven forms)',
    component: FormularioCidadeTdComponent,
  },
  Ou: */
  {
    path: 'formulario-cidade-td',
    children: [
      {
        path: '',
        title: 'Criar - Formulário Cidade (Template-driven forms)',
        component: FormularioCidadeTdComponent,
      },
      {
        path: ':id',
        title: 'Editar - Formulário Cidade (Template-driven forms)',
        component: FormularioCidadeTdComponent,
      }
    ]
  },

  /*{
    path: '',
    title: 'Primeira Página',
    component: PrimeiraPaginaComponent,
  },
  Ou: */
  {
    path: '',
    redirectTo: '/minha-lista',
    pathMatch: 'full',
  },
  {
    path: '**',
    title: '404 - Página não encontrada',
    component: NotFoundComponent,
  },
];
