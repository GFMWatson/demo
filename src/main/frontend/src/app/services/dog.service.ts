import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Dog } from '../classes/dog';


@Injectable()
export class DogService {

  constructor(private http: Http) { }

  getDogs() {
    //return Promise.resolve(this.dogs);
    return this.http.get('/api/dogs')
      .map(
        (response: Response) => {
          return response.json();
        }
      )
  }

 

  dogs: Array<Dog> = [
    { id: 1, rows: 2, name: "Mal", human: "Jeremy", age: 5 },
    { id: 2, rows: 1, name: "Molly", human: "David", age: 5 },
    { id: 3, rows: 1, name: "Sophie", human: "Alex", age: 8 },
    { id: 4, rows: 2, name: "Taz", human: "Joey", age: 0 },
    { id: 5, rows: 1, name: "Kobe", human: "Igor", age: 5 },
    { id: 6, rows: 2, name: "Porter", human: "Kara", age: 3 },
    { id: 7, rows: 1, name: "Stephen", human: "Stephen", age: 8 },
    { id: 8, rows: 1, name: "Cinny", human: "Jules", age: 3 },
    { id: 9, rows: 1, name: "Hermes", human: "Kara", age: 3 }
  ];

}
