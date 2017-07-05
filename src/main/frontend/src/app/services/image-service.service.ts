import {Http, Response} from "@angular/http";
import "rxjs/Rx";
import { Dog } from "../classes/dog";

import {EventEmitter, Injectable} from "@angular/core";

@Injectable()
export class ImageServiceService {
  constructor(){}

    // onTaskAdded = new EventEmitter<Dog>();

    // constructor(private http: Http) {}

    // getDogs(){
    //     return this.http.get('/api/tasks')
    //         .map(
    //             (response: Response) => {
    //                 return response.json();
    //             }
    //         );
    // }

    // addDog(dog: Dog) {
    //     return this.http.post('/api/tasks/save', dog)
    //         .map(
    //             (response: Response) => {
    //                 return response.json();
    //             }
    //         );
    // }

   

}
