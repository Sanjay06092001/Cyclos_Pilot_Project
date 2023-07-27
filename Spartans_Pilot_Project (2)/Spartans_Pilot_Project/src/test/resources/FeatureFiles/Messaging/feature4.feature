

Feature:  Verifying Message History
User have to view the message history of inbox,sent and trash

Background:
Given Launch the cyclos url "https://demo.cyclos.org/"
When Click the login button
And Login with username 'demo' and password "1234"
And Click submit with valid credentials
When Click messages icon

Scenario: checking inbox history
Given  I have to the press inbox radio button
When press appropriate input from dropdown
And In keyword type Inbox mail history
And In user type Active Walking
Then press inbox history

Scenario: checking sent history
Given press sent
When In sent to dropdown box press user
And In keyword type Greetings
And In user click Green shop
Then Click the sent message history

Scenario: checking trash history
Given press trash
When In sent to dropdown box press Administration
And In keyword type banking
And In user click Active Walking
Then Click the trash message history

