# ⚠️ This repository is no longer maintained.

<img src="https://developer.nexmo.com/assets/images/Vonage_Nexmo.svg" height="48px" alt="Nexmo is now known as Vonage" />

## Support Notice
This is an archived repository. If you have any questions, feel free to reach out to us at devrel@vonage.com or through our Community Slack at https://developer.vonage.com/community/slack.

<hr />

Example project that shows how to create a WebSocket server using the Java API for WebSockets. Go to the [tutorial](https://learn.vonage.com/blog/2018/10/22/create-websocket-server-java-api-dr) to follow along and build it from scratch.

We've used JDK 15, Gradle 7.1, Gretty 3.0.5 and Tomcat 9 to build this example. 
> Note: JDK 16 isn't yet supported by the Gretty plug-in.

Server is set to listen on ws://localhost:8080/socket and will respond to both binary and text messages by echoing the contents back to the sender.

## Running Instructions

Clone the project and run `gradle appRun` in the project folder to start it.

Open `http://localhost:8080/` in a web browser.

Run `gradle --stop` to stop it.
