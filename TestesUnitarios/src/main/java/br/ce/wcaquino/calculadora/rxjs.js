const {Observable} = require("rxjs")

const obs = Observable.create(subscriber =>
{
    subscriber.next("rxjs")
    subscriber.complete()
})
//revendo os conceitos semanticos
noovoos
obs.subscribe(txt =>{
    console.log(txt)
})