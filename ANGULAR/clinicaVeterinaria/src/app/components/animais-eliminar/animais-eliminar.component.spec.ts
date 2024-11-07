import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimaisEliminarComponent } from './animais-eliminar.component';

describe('AnimaisEliminarComponent', () => {
  let component: AnimaisEliminarComponent;
  let fixture: ComponentFixture<AnimaisEliminarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AnimaisEliminarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AnimaisEliminarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
