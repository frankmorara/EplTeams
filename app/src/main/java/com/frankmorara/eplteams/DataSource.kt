package com.frankmorara.eplteams

class DataSource {

    fun loadTeam(): List<Team> {
        return listOf(
            Team(R.string.man_u,R.drawable.manutd),
            Team(R.string.liverpool,R.drawable.liverpool),
            Team(R.string.man_city,R.drawable.mancity),
            Team(R.string.chelsea,R.drawable.chelsea),
            Team(R.string.arsenal,R.drawable.arsenal),
            Team(R.string.tottenham,R.drawable.tottenham),
            Team(R.string.leicester,R.drawable.leicester),
            Team(R.string.aston_villa,R.drawable.astonvilla),
            Team(R.string.everton,R.drawable.everton),
            Team(R.string.west_ham,R.drawable.westham)

        )
    }
}