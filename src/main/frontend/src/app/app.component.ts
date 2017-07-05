import { Component , ViewChild, ViewContainerRef } from '@angular/core';
import { MdSidenav, MdDialog, MdDialogConfig } from "@angular/material";
import { SettingsDialog } from "./components/settings-dialog/settings-dialog";
import { Dog } from "./classes/dog";
import { DogService } from "./services/dog.service";



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
   currentDog = {};
  isDarkTheme = false;
  dogs: Dog[];
 

@ViewChild('sidenav') sidenav: MdSidenav;//grabbing local template variable sidnav 

constructor(public dialog: MdDialog, public vcr: ViewContainerRef, public dogService: DogService) {}//the dialog is opened through the dialog service, MdDialog, which is injected here

  getData(): void{
    //this.dogService.getDogs().then((data)=> this.dogs = data); 
    this.dogService.getDogs()
            .subscribe(
                (dogs: any[]) => {
                    this.dogs = dogs
                },
                (error) => console.log(error)
            );

  }

  showDog(dog) {
    this.currentDog = dog;
    console.log(this.currentDog);
    this.sidenav.open();
  }
    openDialog() {
    const config = new MdDialogConfig();
    config.viewContainerRef = this.vcr;//pass in view container ref so angular has info about how it should instantiate the dialog
    this.dialog.open(SettingsDialog, config);
  }

  ngOnInit(){
    this.getData();
  }
}
