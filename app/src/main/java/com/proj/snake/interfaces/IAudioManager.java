package com.proj.snake.interfaces;

public interface IAudioManager {
    // Initializes the sounds.
    void initSounds();
    // Plays the sound with the given soundID.
    void play(int soundID);
    // Checks if the MediaPlayer is released.
    boolean isMspReleased();
    // Reinitializes the sound manager.
    void reinitialize();

    // Toggles the sound on/off.
    void toggleSound(boolean isSoundEnabled);

    // load background music
    void loadBackgroundMusic();

    // play background music
    void playBackgroundMusic();

    boolean isSoundEnabled();
}
