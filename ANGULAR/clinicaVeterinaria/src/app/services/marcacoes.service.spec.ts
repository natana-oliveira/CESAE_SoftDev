import { TestBed } from '@angular/core/testing';

import { MarcacoesService } from './marcacoes.service';

describe('MarcacoesService', () => {
  let service: MarcacoesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MarcacoesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
