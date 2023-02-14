##Description

Proxy means ‘in place of’, 'representing’ or ‘in place of’ or ‘on behalf of’ are literal meanings of proxy and that directly explains Proxy Design Pattern.
Proxies are also called surrogates, handles, and wrappers. They are closely related in structure, but not purpose, to Adapters and Decorators.

A real world example can be a cheque or credit card is a proxy for what is in our bank account. It can be used in place of cash, and provides a means of accessing that cash when required. And that’s exactly what the Proxy pattern does – “Controls and manage access to the object they are protecting“.

###Behavior
As in the decorator pattern, proxies can be chained together. The client and each proxy, believes it is delegating messages to the real server:

![Example](assets/UML_Diagram.jpg)

###When to use this pattern?
Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client.

###Types of proxies
* ####Remote proxy:
They are responsible for representing the object located remotely. Talking to the real object might involve marshalling and unmarshalling of data and talking to the remote object. All that logic is encapsulated in these proxies and the client application need not worry about them.
* ####Virtual proxy:
These proxies will provide some default and instant results if the real object is supposed to take some time to produce results. These proxies initiate the operation on real objects and provide a default result to the application. Once the real object is done, these proxies push the actual data to the client where it has provided dummy data earlier.
* ####Protection proxy:
If an application does not have access to some resource then such proxies will talk to the objects in applications that have access to that resource and then get the result back.
* ####Smart Proxy:
A smart proxy provides additional layer of security by interposing specific actions when the object is accessed. An example can be to check if the real object is locked before it is accessed to ensure that no other object can change it.

###<center>Example</center>
A very simple real life scenario is our college internet, which restricts few site access. The proxy first checks the host you are connecting to, if it is not part of restricted site list, then it connects to the real internet. This example is based on Protection proxies.

see this example in the _'/example/...'_
