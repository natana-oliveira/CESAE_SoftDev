import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TutoresEditarComponent } from './tutores-editar.component';

describe('TutoresEditarComponent', () => {
  let component: TutoresEditarComponent;
  let fixture: ComponentFixture<TutoresEditarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TutoresEditarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TutoresEditarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
