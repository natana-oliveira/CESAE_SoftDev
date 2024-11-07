import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MinhaListaItemComponent } from './minha-lista-item.component';

describe('MinhaListaItemComponent', () => {
  let component: MinhaListaItemComponent;
  let fixture: ComponentFixture<MinhaListaItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MinhaListaItemComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MinhaListaItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
