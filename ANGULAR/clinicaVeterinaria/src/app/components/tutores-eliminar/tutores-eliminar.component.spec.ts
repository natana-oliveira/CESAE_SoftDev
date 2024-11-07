import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TutoresEliminarComponent } from './tutores-eliminar.component';

describe('TutoresEliminarComponent', () => {
  let component: TutoresEliminarComponent;
  let fixture: ComponentFixture<TutoresEliminarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TutoresEliminarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TutoresEliminarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
