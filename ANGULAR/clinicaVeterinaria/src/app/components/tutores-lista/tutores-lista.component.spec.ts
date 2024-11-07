import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TutoresListaComponent } from './tutores-lista.component';

describe('TutoresListaComponent', () => {
  let component: TutoresListaComponent;
  let fixture: ComponentFixture<TutoresListaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TutoresListaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TutoresListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
