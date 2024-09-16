package com.example.heroesapp.models

data class Hero(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val publisherId: Int
) {
    companion object {
        val heroes = listOf(
            // Marvel Heroes
            Hero(1, "Spider-Man", "https://i.pinimg.com/originals/d3/a4/98/d3a498e87019df9a74cb21902628d630.png", 1),
            Hero(2, "Iron Man", "https://pngimg.com/d/ironman_PNG44.png", 1),
            Hero(3, "Captain America", "https://pngfre.com/wp-content/uploads/captain-america-poster.png", 1),
            Hero(4, "Thor", "https://i.pinimg.com/originals/64/dd/21/64dd213f67fd94aebe9613166c8fa9d5.png", 1),
            Hero(5, "Hulk", "https://pngfre.com/wp-content/uploads/hulk-poster.png", 1),
            Hero(6, "Black Widow", "https://clipart-library.com/image_gallery2/Black-Widow-Free-Download-PNG.png", 1),
            Hero(7, "Hawkeye", "https://www.pngarts.com/files/5/Marvel-Hawkeye-PNG-Pic.png", 1),
            Hero(8, "Doctor Strange", "https://i.pinimg.com/originals/f3/45/94/f345946a559f7942ccd474b062eb7231.png", 1),
            Hero(9, "Scarlet Witch", "https://i.pinimg.com/originals/44/41/42/4441424af49f921b47fa50bbc2f88a7a.png", 1),
            Hero(10, "Black Panther", "https://www.pngarts.com/files/9/Marvel-Black-Panther-PNG-Transparent-Images.png", 1),
            Hero(11, "Ant-Man", "https://pngfre.com/wp-content/uploads/Ant-Man-15.png", 1),
            Hero(12, "Wasp", "https://www.twilight-zone.nl/WebRoot/epagesDE/Shops/Twilightzone/63E9/11AC/B1B2/1445/FFCC/0A0C/0595/E707/SSHOT912131_01.png", 1),
            Hero(13, "Vision", "https://www.pngplay.com/wp-content/uploads/9/Marvel-Vision-PNG-Background.png", 1),
            Hero(14, "Falcon", "https://www.pngplay.com/wp-content/uploads/12/Falcon-Marvel-Download-Free-PNG.png", 1),
            Hero(15, "Winter Soldier", "https://i.pinimg.com/originals/3f/f3/64/3ff364334304c96b9ce671e1645e2ce2.png", 1),
            Hero(16, "War Machine", "https://static.wikia.nocookie.net/mcuf/images/6/6b/War_Machine_%28MCU%29.png", 1),
            Hero(17, "Star-Lord", "https://static.wikia.nocookie.net/mua/images/1/10/Img_0015_star_lord_mout.obj.png", 1),
            Hero(18, "Gamora", "https://i.pinimg.com/originals/e6/80/5e/e6805e6e53c0ddffde87f859f0993e96.png", 1),
            Hero(19, "Groot", "https://pngimg.com/d/groot_PNG39.png", 1),
            Hero(20, "Rocket Raccoon", "https://static.wikia.nocookie.net/marvelvscapcom/images/9/98/Rocket_Raccoon_MvCI_render.png", 1),

            // DC Heroes
            Hero(21, "Batman", "https://i.pinimg.com/originals/2f/ea/a3/2feaa346bd96e29c20ccacf92acd7f16.png", 2),
            Hero(22, "Superman", "https://purepng.com/public/uploads/large/purepng.com-supermansupermanfictional-superherocomic-booksdc-comicscharacterjerry-siegelson-of-kryptonaction-comicsman-of-steel-1701528657757hwozy.png", 2),
            Hero(23, "Wonder Woman", "https://pngimg.com/uploads/wonder_woman/wonder_woman_PNG23.png", 2),
            Hero(24, "The Flash", "https://i.pinimg.com/originals/83/10/59/83105916580f7b38172a68bc0cd688bb.png", 2),
            Hero(25, "Aquaman", "https://i.pinimg.com/originals/82/37/ff/8237ff5ba31d12a0fb5f8b787433238e.png", 2),
            Hero(26, "Green Lantern", "https://www.pngall.com/wp-content/uploads/10/Green-Lantern-DC-Comics.png", 2),
            Hero(27, "Cyborg", "https://pngimg.com/uploads/cyborg/cyborg_PNG28.png", 2),
            Hero(28, "Shazam", "https://www.pngarts.com/files/4/Comic-Shazam-PNG-Image.png", 2),
            Hero(29, "Martian Manhunter", "https://upload.wikimedia.org/wikipedia/en/3/34/Martian_Manhunter_Alex_Ross.png", 2),
            Hero(30, "Green Arrow", "https://static.wikia.nocookie.net/all-worlds-alliance/images/9/96/E408bacd4e65e8973a7b7b76f904004d.png", 2),
            Hero(31, "Black Canary", "https://upload.wikimedia.org/wikipedia/en/6/6b/Black_Canary_%28circa_2015%29.png", 2),
            Hero(32, "Supergirl", "https://pngimg.com/uploads/supergirl/supergirl_PNG40.png", 2),
            Hero(33, "Nightwing", "https://www.pngarts.com/files/2/Nightwing-Free-PNG-Image.png", 2),
            Hero(34, "Batgirl", "https://i.pinimg.com/originals/a5/12/51/a512516d3f446aa1dd28c33310366356.png", 2),
            Hero(35, "Robin", "https://static.wikia.nocookie.net/characterprofile/images/7/77/Damien.png", 2),
            Hero(36, "Blue Beetle", "https://static.wikia.nocookie.net/videogamefan/images/6/63/Blue_Beetle.png", 2),
            Hero(37, "Zatanna", "https://static.wikia.nocookie.net/character-level/images/2/2f/Zatanna_DC_PoC_TR_.png", 2),
            Hero(38, "Hawkman", "https://static.wikia.nocookie.net/yunas-princess-adventure/images/5/5c/Hawkman.png", 2),
            Hero(39, "Catwoman", "https://www.pngplay.com/wp-content/uploads/7/Catwoman-Injustice-Transparent-Free-PNG.png", 2),
            Hero(40, "Deathstroke", "https://i.pinimg.com/originals/24/55/91/245591a9aefc78d204e94035696bc70c.png", 2)
        )
    }
}
