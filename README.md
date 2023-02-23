# Game_Of_Life
Spill/Game

Spillets regler

En ny generasjon skapes ved at alle cellene på brettet endrer status avhengig av sine
naboceller. Som naboceller regnes alle berørte celler, både levende og døde.


En celles nye status bestemmes av følgende regler:

● Dersom cellens nåværende status er levende:

○ Ved færre enn to levende naboceller dør cellen (underpopulasjon).

○ Ved to eller tre levende naboceller vil cellen leve videre.

○ Hvis cellen har mer enn tre levende naboceller, vil den dø (overpopulasjon).

● Dersom cellen er død:

○ Cellens status blir levende (reproduksjon) dersom den har nøyaktig tre levende naboer.

○ Ellers forblir den død.

