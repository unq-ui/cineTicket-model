package data

class DataMovie(
    val poster: String,
    val title: String,
    val genre: List<String>,
    val releaseDate: String,
    val description: String,
)

val movies = mutableListOf<DataMovie>(
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/9nhjGaFLKtddDPtPaX5EmKqsWdH.jpg",
        "The Gorge",
        listOf(
        "Action",
        "Horror",
        "Romance",
        "Science Fiction",
        "Thriller"
        ),
        "2025-02-13",
        "Two highly trained operatives grow close from a distance after being sent to guard opposite sides of a mysterious gorge. When an evil below emerges, they must work together to survive what lies within."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/qfAfE5auxsuxhxPpnETRAyTP5ff.jpg",
        "Captain America: Brave New World",
        listOf(
        "Action",
        "Thriller",
        "Science Fiction"
        ),
        "2025-02-12",
        "After meeting with newly elected U.S. President Thaddeus Ross, Sam finds himself in the middle of an international incident. He must discover the reason behind a nefarious global plot before the true mastermind has the entire world seeing red."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/rOMLLMGgDgGG6XeT3P8sUdUb8nl.jpg",
        "Flight Risk",
        listOf(
        "Action",
        "Thriller",
        "Crime"
        ),
        "2025-01-22",
        "A U.S. Marshal escorts a government witness to trial after he's accused of getting involved with a mob boss, only to discover that the pilot who is transporting them is also a hitman sent to assassinate the informant. After they subdue him, they're forced to fly together after discovering that there are others attempting to eliminate them."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/lWMa1FdgC7zP9ATVg6dgpZ3rxhe.jpg",
        "Mufasa: The Lion King",
        listOf(
        "Adventure",
        "Family",
        "Animation"
        ),
        "2024-12-18",
        "Mufasa, a cub lost and alone, meets a sympathetic lion named Taka, the heir to a royal bloodline. The chance meeting sets in motion an expansive journey of a group of misfits searching for their destiny."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/hfTyu2VPBqLRPo2DauW8q7bh9bm.jpg",
        "Paddington in Peru",
        listOf(
        "Family",
        "Adventure",
        "Comedy"
        ),
        "2024-11-08",
        "Paddington travels to Peru to visit his beloved Aunt Lucy, who now resides at the Home for Retired Bears. With the Brown Family in tow, a thrilling adventure ensues when a mystery plunges them into an unexpected journey through the Amazon rainforest and up to the mountain peaks of Peru."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/zwSDvbnN51JqU1ULzPnEc22DkqV.jpg",
        "Bridget Jones: Mad About the Boy",
        listOf(
        "Comedy",
        "Drama",
        "Romance"
        ),
        "2025-02-12",
        "Bridget Jones finally has some luck in her life; she has a great job as a screenwriter, her family and a new boyfriend; the fact that he's over twenty years her junior isn't the only thing causing problems."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/h7r6LZ32dgLwtwSW3CxoWIYD9pr.jpg",
        "Nosferatu",
        listOf(
        "Horror",
        "Fantasy"
        ),
        "2024-12-25",
        "A gothic tale of obsession between a haunted young woman and the terrifying vampire infatuated with her, causing untold horror in its wake."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/uJK0jjJ8QDOQw5lcNBwu059ht4D.jpg",
        "My Fault: London",
        listOf(
        "Romance",
        "Drama"
        ),
        "2025-02-12",
        "18-year-old Noah moves from America to London, with her mother who's recently fallen in love with William, a wealthy British businessman. Noah meets William’s son, bad-boy Nick, and soon discovers there is an attraction between them neither can avoid. As Noah spends the summer adjusting to her new life, her devastating past will catch up with her while falling in love for the first time."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/hmZnqijPaaACjenDkrbWcCmcADI.jpg",
        "The Brutalist",
        listOf(
        "Drama"
        ),
        "2024-12-20",
        "Escaping post-war Europe, visionary architect László Toth arrives in America to rebuild his life, his work, and his marriage to his wife Erzsébet after being forced apart during wartime by shifting borders and regimes. On his own in a strange new country, László settles in Pennsylvania, where the wealthy and prominent industrialist Harrison Lee Van Buren recognizes his talent for building. But power and legacy come at a heavy cost."
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/8btfz81bOJ2lC7cujYBTw03wzg3.jpg",
        "Ne Zha 2",
        listOf(
        "Animation",
        "Fantasy",
        "Adventure"
        ),
        "2025-01-29",
        "After the Tribulation, although the souls of Ne Zha and Ao Bing were preserved, their physical bodies would soon be completely destroyed. Tai Yi Zhen Ren plans to use the Seven Colored Lotus to reshape their physical forms. But in the process of reshaping, they encounter numerous difficulties. Where will the fate of Ne Zha and Ao Bing go?"
    ),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/kEYWal656zP5Q2Tohm91aw6orlT.jpg",
        "Anora",
        listOf(
        "Drama",
        "Comedy",
        "Romance"
        ),
        "2024-10-14",
        "A young sex worker from Brooklyn gets her chance at a Cinderella story when she meets and impulsively marries the son of an oligarch. Once the news reaches Russia, her fairytale is threatened as his parents set out to get the marriage annulled."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/66nlC5LDZmDUWONGkUZT2BrOszG.jpg",
        "Conclave",
        listOf(
        "Drama",
        "Mystery",
        "Thriller"
        ),
        "2024-10-25",
        "After the unexpected death of the Pope, Cardinal Lawrence is tasked with managing the covert and ancient ritual of electing a new one. Sequestered in the Vatican with the Catholic Church’s most powerful leaders until the process is complete, Lawrence finds himself at the center of a conspiracy that could lead to its downfall."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/3QeuagbU1YARTkGrPS4dvYSQGZi.jpg",
        "Better Man",
        listOf(
        "Music",
        "Drama"
        ),
        "2024-12-14",
        "Follow Robbie Williams' journey from childhood, to being the youngest member of chart-topping boyband Take That, through to his unparalleled achievements as a record-breaking solo artist – all the while confronting the challenges that stratospheric fame and success can bring."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/jTOeWjamUKGxWVUO1TMZXqQUarw.jpg",
        "Wicked",
        listOf(
        "Drama",
        "Romance",
        "Fantasy"
        ),
        "2024-11-20",
        "In the land of Oz, ostracized and misunderstood green-skinned Elphaba is forced to share a room with the popular aristocrat Glinda at Shiz University, and the two's unlikely friendship is tested as they begin to fulfill their respective destinies as Glinda the Good and the Wicked Witch of the West."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/bFPqSvR2EmWQ9AlzWkC801XpoAZ.jpg",
        "The Substance",
        listOf(
        "Horror",
        "Science Fiction"
        ),
        "2024-09-07",
        "A fading celebrity decides to use a black market drug, a cell-replicating substance that temporarily creates a younger, better version of herself."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/zOpe0eHsq0A2NvNyBbtT6sj53qV.jpg",
        "Sonic the Hedgehog 3",
        listOf(
        "Action",
        "Science Fiction",
        "Comedy",
        "Family"
        ),
        "2024-12-19",
        "Sonic, Knuckles, and Tails reunite against a powerful new adversary, Shadow, a mysterious villain with powers unlike anything they have faced before. With their abilities outmatched in every way, Team Sonic must seek out an unlikely alliance in hopes of stopping Shadow and protecting the planet."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/1YL8ksfwm3p2Tgt1yaNVYYOvOKC.jpg",
        "The Witcher: Sirens of the Deep",
        listOf(
        "Animation",
        "Fantasy",
        "Action"
        ),
        "2025-02-10",
        "Geralt of Rivia, a mutated monster hunter, is hired to investigate a series of attacks in a seaside village and finds himself drawn into a centuries-old conflict between humans and merpeople. He must count on friends — old and new — to solve the mystery before the hostilities between the two kingdoms escalate into an all-out war."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/b3mdmjYTEL70j7nuXATUAD9qgu4.jpg",
        "Flow",
        listOf(
        "Animation",
        "Fantasy",
        "Adventure"
        ),
        "2024-08-29",
        "A solitary cat, displaced by a great flood, finds refuge on a boat with various species and must navigate the challenges of adapting to a transformed world together."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/zo8CIjJ2nfNOevqNajwMRO6Hwka.jpg",
        "Moana 2",
        listOf(
        "Animation",
        "Adventure",
        "Family",
        "Comedy"
        ),
        "2024-11-21",
        "After receiving an unexpected call from her wayfinding ancestors, Moana journeys alongside Maui and a new crew to the far seas of Oceania and into dangerous, long-lost waters for an adventure unlike anything she's ever faced."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/eGK2JJO1ZeoabWThHmC9IjUTmfP.jpg",
        "Ne Zha",
        listOf(
        "Animation",
        "Fantasy",
        "Adventure"
        ),
        "2019-07-26",
        "The Primus extracts a Mixed Yuan Bead into a Spirit Seed and a Demon Pill. The Spirit Seed can be reincarnated as a human to help King Zhou establish a new dynasty, whereas the Demon Pill will create a devil threatening humanity. Ne Zha is the one who is destined to be the hero, but instead he becomes a devil incarnate, because the Spirit Seed and a Demon Pill are switched."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/6dC7ULfiutxwEAs7LjWHL2Tc7Zv.jpg",
        "The Monkey",
        listOf(
        "Horror",
        "Comedy"
        ),
        "2025-02-14",
        "When twin brothers find a mysterious wind-up monkey, a series of outrageous deaths tear their family apart. Twenty-five years later, the monkey begins a new killing spree forcing the estranged brothers to confront the cursed toy."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/l2QSVFR5aLcW1Vl4cGKrQkEp6fY.jpg",
        "Dhoom Dhaam",
        listOf(
        "Comedy",
        "Romance",
        "Action"
        ),
        "2025-02-13",
        "On their wedding night, an oddball couple is thrust into a chaotic chase, dodging goons and cops in a frenzied hunt for the mysterious \"Charlie.\""
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/wVLPPX2DXQmfkzDe6MOsJJfbKEX.jpg",
        "The Most Beautiful Girl in the World",
        listOf(
        "Romance",
        "Comedy"
        ),
        "2025-02-13",
        "A playboy stages a dating show to earn his inheritance by granting his father's last wish: for his son to marry the most beautiful girl in the world."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/lBcXozUeABairkTavz3X3ZAtOL0.jpg",
        "Beating Hearts",
        listOf(
        "Romance",
        "Crime",
        "Drama"
        ),
        "2024-10-16",
        "Jackie and Clotaire grow up at the same high school, around the same harbour docks. She studies, he bunks off. Their paths cross, and they fall madly in love. Life tries its best to keep them apart, but they are like two halves of the same heart."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/kNn0Jas42EXpBt3WBxwJqhU6VnT.jpg",
        "The World Upside Down",
        listOf(
        "Comedy",
        "Drama"
        ),
        "2024-10-16",
        "A Parisian trader who – after losing everything – is forced to take refuge on a country farm with his wife and child."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/2P0PUkQ1tNHNYTEmtbBmM8MfXBG.jpg",
        "Mickey 17",
        listOf(
        "Science Fiction",
        "Comedy",
        "Drama"
        ),
        "2025-02-28",
        "Mickey Barnes has found himself in the extraordinary circumstance of working for an employer who demands the ultimate commitment to the job… to die, for a living."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/vgnoBSVzWAV9sNQUORaDGvDp7wx.jpg",
        "Interstellar",
        listOf(
        "Adventure",
        "Drama",
        "Science Fiction"
        ),
        "2014-11-05",
        "The adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/e8npsTfpBZa8T0TQqyZSwD9RNu2.jpg",
        "Love Forever",
        listOf(
        "Romance",
        "Comedy",
        "Drama"
        ),
        "2025-02-13",
        "A Stockholm couple plans to get married on the gorgeous island of Gotland, where family-imposed traditions turn their most important day into a disaster."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/x2RS3uTcsJJ9IfjNPcgDmukoEcQ.jpg",
        "The Lord of the Rings: The Fellowship of the Ring",
        listOf(
        "Adventure",
        "Fantasy",
        "Action"
        ),
        "2001-12-18",
        "Young hobbit Frodo Baggins, after inheriting a mysterious ring from his uncle Bilbo, must leave his home in order to keep it from falling into the hands of its evil creator. Along the way, a fellowship is formed to protect the ringbearer and make sure that the ring arrives at its final destination: Mt. Doom, the only place where it can be destroyed."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/jtw94phTSBp4j65sKp1XLr00DAu.jpg",
        "SNL50: The Homecoming Concert",
        listOf(
        "Comedy",
        "Music"
        ),
        "2025-02-14",
        "Live from Radio City Music Hall, witness the concert of a lifetime with a star-studded lineup bringing together legendary Saturday Night Live hall-of-famers, iconic guests and surprise musical performances."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/vZG7PrX9HmdgL5qfZRjhJsFYEIA.jpg",
        "Venom: The Last Dance",
        listOf(
        "Action",
        "Science Fiction",
        "Adventure"
        ),
        "2024-10-22",
        "Eddie and Venom are on the run. Hunted by both of their worlds and with the net closing in, the duo are forced into a devastating decision that will bring the curtains down on Venom and Eddie's last dance."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/aMbKYfaexixvsBZKc5whYO7yibR.jpg",
        "The Order",
        listOf(
        "Crime",
        "Drama",
        "Thriller"
        ),
        "2024-12-05",
        "A string of violent robberies in the Pacific Northwest leads veteran FBI agent Terry Husk into a white supremacist plot to overthrow the federal government."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/xOMo8BRK7PfcJv9JCnx7s5hj0PX.jpg",
        "Dune: Part Two",
        listOf(
        "Science Fiction",
        "Adventure"
        ),
        "2024-02-27",
        "Follow the mythic journey of Paul Atreides as he unites with Chani and the Fremen while on a path of revenge against the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the known universe, Paul endeavors to prevent a terrible future only he can foresee."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/u2eA9pqi1q3DvevT7RuDuJHxxBT.jpg",
        "Emilia Pérez",
        listOf(
        "Drama",
        "Thriller"
        ),
        "2024-08-21",
        "Rita, an underrated lawyer working for a large law firm more interested in getting criminals out of jail than bringing them to justice, is hired by the leader of a criminal organization."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/s1ge9SG2zfJdMeZ69VMEbxeKuAE.jpg",
        "La Dolce Villa",
        listOf(
        "Romance",
        "Comedy"
        ),
        "2025-02-12",
        "When his daughter decides to buy a crumbling Tuscan villa, Eric rushes to Italy to talk her out of it — and instead finds beauty, romance and new purpose."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/1pmXyN3sKeYoUhu5VBZiDU4BX21.jpg",
        "The Wild Robot",
        listOf(
        "Animation",
        "Science Fiction",
        "Family"
        ),
        "2024-09-12",
        "After a shipwreck, an intelligent robot called Roz is stranded on an uninhabited island. To survive the harsh environment, Roz bonds with the island's animals and cares for an orphaned baby goose."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/bfh9Z3Ghz4FOJAfLOAhmc3ccnHU.jpg",
        "Harry Potter and the Philosopher's Stone",
        listOf(
        "Adventure",
        "Fantasy"
        ),
        "2001-11-16",
        "Harry Potter has lived under the stairs at his aunt and uncle's house his whole life. But on his 11th birthday, he learns he's a powerful wizard—with a place waiting for him at the Hogwarts School of Witchcraft and Wizardry. As he learns to harness his newfound powers with the help of the school's kindly headmaster, Harry uncovers the truth about his parents' deaths—and about the villain who's to blame."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/qFhEsMDr3oa1MgSyUEXKsk8tsrV.jpg",
        "Broken Rage",
        listOf(
        "Crime",
        "Drama",
        "Comedy"
        ),
        "2024-09-06",
        "A seemingly unremarkable man called “Mouse” is caught by the police. In exchange for his freedom, he goes undercover, infiltrates a drug ring, and arranges a fake deal, but an unexpected turn of events occurs... Director Takeshi Kitano presents a two-part film: a serious yakuza action and a self-parodying comedy of the same story. What is the fate of \"Mouse\"?"
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/eT1udCQQAXVuLkb26911aUwg76L.jpg",
        "Umjolo: There Is No Cure",
        listOf(
        "Romance",
        "Comedy",
        "Drama"
        ),
        "2025-02-13",
        "After losing her title for publicly exposing a scandal, a former pageant queen works on a tell-all book — all while her love life remains unwritten."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/sc1abgWNXc29wSBaerrjGBih06l.jpg",
        "Companion",
        listOf(
        "Horror",
        "Science Fiction",
        "Thriller"
        ),
        "2025-01-22",
        "During a weekend getaway at a secluded lakeside estate, a group of friends finds themselves entangled in a web of secrets, deception, and advanced technology. As tensions rise and loyalties are tested, they uncover unsettling truths about themselves and the world around them."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/v9Du2HC3hlknAvGlWhquRbeifwW.jpg",
        "Kraven the Hunter",
        listOf(
        "Action",
        "Adventure",
        "Thriller"
        ),
        "2024-12-11",
        "Kraven Kravinoff's complex relationship with his ruthless gangster father, Nikolai, starts him down a path of vengeance with brutal consequences, motivating him to become not only the greatest hunter in the world, but also one of its most feared."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/pz0wQh69Fc88xJgEBGCnr8RHmQj.jpg",
        "Honeymoon Crasher",
        listOf(
        "Comedy"
        ),
        "2025-02-11",
        "When his fiancée dumps him at the altar for her ex, a young man is left with no alternative but to go on his romantic honeymoon with his mother."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/bIh56F8e5EaZ3r2nD1hXAOisItZ.jpg",
        "Bambi, a Life in the Woods",
        listOf(
        "Adventure",
        "Family"
        ),
        "2024-10-16",
        "The life of Bambi, a male roe deer, from his birth through childhood, the loss of his mother, the finding of a mate, the lessons he learns from his father, and the experience he gains about the dangers posed by human hunters in the forest."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/j9uruwRe9qM8RnP758dF7ISB8Bj.jpg",
        "I'm Still Here",
        listOf(
        "Drama",
        "History"
        ),
        "2024-09-19",
        "In the early 1970s, the military dictatorship in Brazil reaches its height. The Paiva family - Rubens, Eunice, and their five children - live in a beachside house in Rio, open to all their friends. One day, Rubens is taken for questioning and does not return."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/4qCqAdHcNKeAHcK8tJ8wNJZa9cx.jpg",
        "Star Wars",
        listOf(
        "Adventure",
        "Action",
        "Science Fiction"
        ),
        "1977-05-25",
        "Princess Leia is captured and held hostage by the evil Imperial forces in their effort to take over the galactic Empire. Venturesome Luke Skywalker and dashing captain Han Solo team together with the loveable robot duo R2-D2 and C-3PO to rescue the beautiful princess and restore peace and justice in the Empire."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/fViElUGfdoZjtnVxvSpJX8TwxY6.jpg",
        "A Real Pain",
        listOf(
        "Comedy",
        "Drama"
        ),
        "2024-11-01",
        "Mismatched cousins David and Benji reunite for a tour through Poland to honor their beloved grandmother. The adventure takes a turn when the pair's old tensions resurface against the backdrop of their family history."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/p5ozvmdgsmbWe0H8Xk7Rc8SCwAB.jpg",
        "Inside Out 2",
        listOf(
        "Animation",
        "Adventure",
        "Comedy",
        "Family"
        ),
        "2024-06-11",
        "Teenager Riley's mind headquarters is undergoing a sudden demolition to make room for something entirely unexpected: new Emotions! Joy, Sadness, Anger, Fear and Disgust, who’ve long been running a successful operation by all accounts, aren’t sure how to feel when Anxiety shows up. And it looks like she’s not alone."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/8eihUxjQsJ7WvGySkVMC0EwbPAD.jpg",
        "Parasite",
        listOf(
        "Comedy",
        "Thriller",
        "Drama"
        ),
        "2019-05-30",
        "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/eHu1ZxFPmqyhnait9VdsOQBEFOk.jpg",
        "Wolf Man",
        listOf(
        "Horror",
        "Thriller"
        ),
        "2025-01-15",
        "With his marriage fraying, Blake persuades his wife Charlotte to take a break from the city and visit his remote childhood home in rural Oregon. As they arrive at the farmhouse in the dead of night, they're attacked by an unseen animal and barricade themselves inside the home as the creature prowls the perimeter. But as the night stretches on, Blake begins to behave strangely, transforming into something unrecognizable."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/vl2kXg2Fs0LA1uwXwBFBcuZCfyx.jpg",
        "Paddington",
        listOf(
        "Comedy",
        "Adventure",
        "Family"
        ),
        "2014-11-24",
        "A young Peruvian bear travels to London in search of a new home. Finding himself lost and alone at Paddington Station, he meets the kindly Brown family."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/hctfNoMpQGfn3VXdBYb9p0P5bT5.jpg",
        "Babygirl",
        listOf(
        "Drama"
        ),
        "2024-12-25",
        "A high-powered CEO puts her career and family on the line when she begins a torrid affair with her much younger intern."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/3bBu3xpbRRulHuinDd8SwQemhwe.jpg",
        "Nickel Boys",
        listOf(
        "Drama"
        ),
        "2024-12-13",
        "Chronicles the powerful friendship between two young Black teenagers navigating the harrowing trials of reform school together in Florida."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/yFuKvT4Vm3sKHdFY4eG6I4ldAnn.jpg",
        "Captain America: The First Avenger",
        listOf(
        "Action",
        "Adventure",
        "Science Fiction"
        ),
        "2011-07-22",
        "During World War II, Steve Rogers is a sickly man from Brooklyn who's transformed into super-soldier Captain America to aid in the war effort. Rogers must stop the Red Skull – Adolf Hitler's ruthless head of weaponry, and the leader of an organization that intends to use a mysterious device of untold powers for world domination."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/4O8s9kF6pW5xxSidsyz71nHB3Du.jpg",
        "Snow White",
        listOf(
        "Family",
        "Fantasy"
        ),
        "2025-03-19",
        "A beautiful girl, Snow White, takes refuge in the forest in the house of seven dwarfs to hide from her stepmother, the wicked Queen. The Queen is jealous because she wants to be known as \"the fairest in the land,\" and Snow White's beauty surpasses her own."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/euYIwmwkmz95mnXvufEmbL6ovhZ.jpg",
        "Gladiator II",
        listOf(
        "Action",
        "Adventure",
        "Drama"
        ),
        "2024-11-05",
        "Years after witnessing the death of the revered hero Maximus at the hands of his uncle, Lucius is forced to enter the Colosseum after his home is conquered by the tyrannical Emperors who now lead Rome with an iron fist. With rage in his heart and the future of the Empire at stake, Lucius must look to his past to find strength and honor to return the glory of Rome to its people."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/aJ3tiwuqRWgjvMonTC8499BCBi4.jpg",
        "Undercover",
        listOf(
        "Drama",
        "Crime",
        "Thriller"
        ),
        "2024-10-11",
        "Basque Country, Spain, late nineties. A young policewoman manages to infiltrate the ruthless terrorist gang ETA."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/26OvB15pqk3eiKJG8LrXDVzO7Mw.jpg",
        "Constantine",
        listOf(
        "Fantasy",
        "Action",
        "Horror"
        ),
        "2005-02-08",
        "John Constantine has literally been to Hell and back. When he teams up with a policewoman to solve the mysterious suicide of her twin sister, their investigation takes them through the world of demons and angels that exists beneath the landscape of contemporary Los Angeles."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/oOv2oUXcAaNXakRqUPxYq5lJURz.jpg",
        "The Dark Knight",
        listOf(
        "Drama",
        "Action",
        "Crime",
        "Thriller"
        ),
        "2008-07-16",
        "Batman raises the stakes in his war on crime. With the help of Lt. Jim Gordon and District Attorney Harvey Dent, Batman sets out to dismantle the remaining criminal organizations that plague the streets. The partnership proves to be effective, but they soon find themselves prey to a reign of chaos unleashed by a rising criminal mastermind known to the terrified citizens of Gotham as the Joker."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/4WHRiFgbsAuSJ79fyr8pTXkj4G2.jpg",
        "A Complete Unknown",
        listOf(
        "Drama",
        "Music"
        ),
        "2024-12-18",
        "New York, early 1960s. Against the backdrop of a vibrant music scene and tumultuous cultural upheaval, an enigmatic 19-year-old from Minnesota arrives in the West Village with his guitar and revolutionary talent, destined to change the course of American music."
),
    DataMovie(
        "https://image.tmdb.org/t/p/w1000_and_h563_face/jYEW5xZkZk2WTrdbMGAPFuBqbDc.jpg",
        "Dune",
        listOf(
        "Science Fiction",
        "Adventure"
        ),
        "2021-09-15",
        "Paul Atreides, a brilliant and gifted young man born into a great destiny beyond his understanding, must travel to the most dangerous planet in the universe to ensure the future of his family and his people. As malevolent forces explode into conflict over the planet's exclusive supply of the most precious resource in existence-a commodity capable of unlocking humanity's greatest potential-only those who can conquer their fear will survive."
    )
)