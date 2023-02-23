# Game_Of_Life
Spill/Game

Spillets regler

En ny generasjon skapes ved at alle cellene på brettet endrer status avhengig av sine
naboceller. Som naboceller regnes alle berørte celler, både levende og døde.
Illustrasjon 1: En celle (X) og dens naboceller (n, grønne celler er levende). X har altså 8
naboceller og 2 av dem er levende.

En celles nye status bestemmes av følgende regler:

● Dersom cellens nåværende status er levende:

○ Ved færre enn to levende naboceller dør cellen (underpopulasjon).

○ Ved to eller tre levende naboceller vil cellen leve videre.

○ Hvis cellen har mer enn tre levende naboceller, vil den dø (overpopulasjon).

● Dersom cellen er død:

○ Cellens status blir levende (reproduksjon) dersom den har nøyaktig tre levende naboer.

○ Ellers forblir den død.

