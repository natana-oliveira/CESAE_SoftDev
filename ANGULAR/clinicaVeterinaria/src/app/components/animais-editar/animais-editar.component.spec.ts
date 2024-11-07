import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimaisEditarComponent } from './animais-editar.component';

describe('AnimaisEditarComponent', () => {
  let component: AnimaisEditarComponent;
  let fixture: ComponentFixture<AnimaisEditarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AnimaisEditarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AnimaisEditarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
