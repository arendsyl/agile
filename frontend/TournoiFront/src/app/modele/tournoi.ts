export interface Tournoi {
    nom: string,
    description: string,
    dateDebut: string,
    dateFin: string,
    nombreDePlaceMin: number,
    nombreDePlaceMax: number,
    estGratuit: boolean,
    organisateur:string[]
}
