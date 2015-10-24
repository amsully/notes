# Design

Moving beyond requirements

**Object Orientated Design** - We discover interfaces between modules are extremely important.

#### Decomposition of Problems

The entire process of design is to break down the program into smaller pieces.

[System] 

[Module] [Module 01] [Module 03]

The modules make up the system, are there interdependencies?

We must define interfaces between modules. We can also say there are layers.

## Example Design: Alarm Clock

[Electronic Display - ]           
[Input Controls - snooze button, set alarm time, set alarm off, turn alarm off/on, set time, volume]

### Alarm Clock Software

Initial state blinking noon

[Display Module (State Display)]  [Input Module] 

[Sound Control]   [State Control (Input Module)] 

**Display Module**

- displayTime
- setAlarmIndicator (boolean)
- setPMIndicator (boolean)

**Sound Control**

- turnSoundOn/Off
- setVolume
- setSong
    
**State Control**

- setCurrentTime
- getCurrentTime
- alarm
- snooze
- getAlarmTime
- plusButtonPressed

setCurrentTime <- Adapter <- Hardware DControl









