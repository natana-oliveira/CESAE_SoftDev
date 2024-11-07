export interface Marcacao {
    id?: string;
    tipo: string;
    animalId: string;
    tutorId: string;
    dataHora: Date;
    realizada?: boolean;
    cancelada?: boolean;
  }