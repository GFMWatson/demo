import { Component } from '@angular/core';

@Component({//this is the component that pops up when you click on settings
  selector: 'settings-dialog',
  template: `
    <label>Would you like dog pics every min???</label>
    <md-slide-toggle></md-slide-toggle>
  `
})
export class SettingsDialog {
//this is the dialog for the handler for the settings menu 
}

