public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        // Create commands
        Command tvOn = new TurnTVOn(tv);
        Command tvOff = new TurnTVOff(tv);

        Command stereoSetVolume = new SetVolume(stereo, 5);
        Command stereoOff = new s(stereo);

        Command lightDim = new DimLights(light, 50);
        Command lightOff = new TurnLightsOff(light);

        // Assign commands to remote slots
        remoteControl.setCommand(0, tvOn, tvOff);
        remoteControl.setCommand(1, stereoSetVolume, stereoOff);
        remoteControl.setCommand(2, lightDim, lightOff);

        // Test commands
        remoteControl.onButtonPressed(0);  // TV On
        remoteControl.onButtonPressed(1);  // Stereo Volume 5
        remoteControl.onButtonPressed(2);  // Light Dim to 50%

        // Undo last command (Light Dim)
        remoteControl.undoButtonPressed();

        // Turn off devices
        remoteControl.offButtonPressed(0);  // TV Off
        remoteControl.offButtonPressed(1);  // Stereo Off
        remoteControl.offButtonPressed(2);  // Light Off
    }
}
