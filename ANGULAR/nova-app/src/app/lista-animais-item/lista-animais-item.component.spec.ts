import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaAnimaisItemComponent } from './lista-animais-item.component';

describe('ListaAnimaisItemComponent', () => {
  let component: ListaAnimaisItemComponent;
  let fixture: ComponentFixture<ListaAnimaisItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaAnimaisItemComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListaAnimaisItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
