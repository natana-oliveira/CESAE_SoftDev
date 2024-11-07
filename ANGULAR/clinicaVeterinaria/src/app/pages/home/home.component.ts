import { Component } from '@angular/core';
import { MarcacoesListaComponent } from '../../components/marcacoes-lista/marcacoes-lista.component';
import { RouterLink } from '@angular/router';
import { AnimaisListaComponent } from "../../components/animais-lista/animais-lista.component";
import { TutoresListaComponent } from "../../components/tutores-lista/tutores-lista.component";

@Component({
    selector: 'app-home',
    standalone: true,
    templateUrl: './home.component.html',
    styleUrl: './home.component.scss',
    imports: [MarcacoesListaComponent, RouterLink, AnimaisListaComponent, TutoresListaComponent]
})
export class HomeComponent {

}
