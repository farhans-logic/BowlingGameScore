# Bowling Score

## Scoring Summary

### 10 Frames
- Frames 1 - 9 = min 1 and max 2 throws
- Frame 10 = min 2 and max 3 throws

### Frame Scoring Logic
- Strike 'x' = All pins down in 1 throw (10 points)
- - if next is also strike then add next 2 frames
    (+10 points + (next frame score or repeat for another strike))
- - if next frame is not strike then add next 2 throws score
- Spare '/' = All pins down in 2 throws + next 1 throw
- Miss '-' no pins knocked down
- If not 'x' or '/' then total frame score is throw 1 + throw 2 (max = 9)

### Total Rolls in the game
- min 12
- max 21

### Constraints

- Does not check for number of roles or frames
- Does not provide intermediary scores

