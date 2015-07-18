//
var hello = require('./hello');
hello.world();

//
var b = require('./base');
var bb = new b();
c = bb.add(2,3);
console.log(c); 

//
var EventEmitter = require('events').EventEmitter; 
var event = new EventEmitter(); 
event.on('some_event', function() { 
	console.log('some_event occured.'); 
}); 
setTimeout(function() { 
	event.emit('some_event'); 
}, 1000); 

//
var events = require('events'); 
var emitter = new events.EventEmitter(); 
emitter.on('someEvent', function(arg1, arg2) { 
	console.log('listener1', arg1, arg2); 
}); 
emitter.on('someEvent', function(arg1, arg2) { 
	console.log('listener2', arg1, arg2); 
}); 
emitter.emit('someEvent', 'byvoid', 1991); 

//function
function sayHello(name){
	console.log("Hello "+name);
}

function say(word) {
  console.log(word);
}
function execute(someFunction, value) {
  someFunction(value);
}
execute(say, "Hello");
//
















