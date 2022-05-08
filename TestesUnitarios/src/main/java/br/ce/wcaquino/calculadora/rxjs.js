const {Observable} = require("rxjs")

const obs = Observable.create(subscriber =>
{
    subscriber.next("rxjs")
    subscriber.complete()
})
obs.subscribe(txt =>{
    console.log(txt)
})