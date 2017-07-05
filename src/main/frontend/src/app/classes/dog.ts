export class Dog {
    public id: number;
    public rows: number;
    public name: string;
    public human: string;
    public age: number;

    constructor(rows: number, name: string, human: string, age: number){
        this.name = name;
        this.rows = rows;
        this.human = human;
        this.age = age;

    }
}
