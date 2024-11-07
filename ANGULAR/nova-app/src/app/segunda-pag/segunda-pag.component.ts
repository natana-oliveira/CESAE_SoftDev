import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-segunda-pag',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RouterLinkActive],
  templateUrl: './segunda-pag.component.html',
  styleUrl: './segunda-pag.component.scss',
})
export class SegundaPagComponent {}
