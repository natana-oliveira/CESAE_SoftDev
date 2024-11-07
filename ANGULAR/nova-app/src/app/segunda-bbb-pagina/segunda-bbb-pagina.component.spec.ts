import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina.component';

describe('SegundaBbbPaginaComponent', () => {
  let component: SegundaBbbPaginaComponent;
  let fixture: ComponentFixture<SegundaBbbPaginaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SegundaBbbPaginaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SegundaBbbPaginaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
