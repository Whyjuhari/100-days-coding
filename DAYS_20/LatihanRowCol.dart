import "package:flutter/material.dart";

class RowColPractice extends StatefulWidget {
  const RowColPractice({super.key});

  @override
  State<RowColPractice> createState() => _RowColPracticeState();
}

class _RowColPracticeState extends State<RowColPractice> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text("LATIHAN BARIS DAN KOLOM"),
          centerTitle: true,
        ),
        body: SingleChildScrollView(
          child: Container(
            padding: const EdgeInsets.all(20.0),
            child: Column(
              children: [
                // Baris pertama
                Row(
                  children: [
                    Container(
                      height: 100,
                      width: MediaQuery.of(context).size.width * 0.30,
                      decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 6, 145, 209),
                      ),
                      child: Container(
                        margin: const EdgeInsets.all(25),
                        height: 100,
                        decoration: const BoxDecoration(
                          color: Color.fromARGB(255, 228, 22, 22),
                        ),
                      ),
                    ),
                    const SizedBox(
                      width: 20,
                    ),
                    Column(
                      children: [
                        Container(
                          height: 40,
                          width: MediaQuery.of(context).size.width * 0.30,
                          decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 6, 145, 209)),
                        ),
                        const SizedBox(
                          height: 20,
                        ),
                        Container(
                          height: 40,
                          width: MediaQuery.of(context).size.width * 0.30,
                          decoration: const BoxDecoration(
                            color: Color.fromARGB(255, 6, 145, 209),
                          ),
                        ),
                      ],
                    ),
                    const SizedBox(
                      width: 20,
                    ),
                    Expanded(
                      child: Container(
                        height: 100,
                        width: MediaQuery.of(context).size.width * 0.30,
                        decoration: const BoxDecoration(
                          color: Color.fromARGB(255, 6, 145, 209),
                        ),
                      ),
                    ),
                  ],
                ),
                const SizedBox(
                  height: 20,
                ),
                // Baris kedua
                Row(
                  children: [
                    Container(
                      height: 100,
                      padding: const EdgeInsets.all(10),
                      width: MediaQuery.of(context).size.width * 0.64,
                      decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 6, 145, 209),
                      ),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        children: [
                          Container(
                            height: 100,
                            width: MediaQuery.of(context).size.width * 0.07,
                            decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 228, 22, 22),
                            ),
                          ),
                          Container(
                            height: 100,
                            width: MediaQuery.of(context).size.width * 0.07,
                            decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 228, 22, 22),
                            ),
                          ),
                          Container(
                            height: 100,
                            width: MediaQuery.of(context).size.width * 0.07,
                            decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 228, 22, 22),
                            ),
                          ),
                        ],
                      ),
                    ),
                    const SizedBox(
                      width: 17,
                    ),
                    Expanded(
                      child: Container(
                        padding: const EdgeInsets.only(
                            top: 15, bottom: 15, left: 20, right: 20),
                        height: 100,
                        width: MediaQuery.of(context).size.width * 0.30,
                        decoration: const BoxDecoration(
                          color: Color.fromARGB(255, 6, 145, 209),
                        ),
                        child: Column(
                          children: [
                            Container(
                              height: 30,
                              width: MediaQuery.of(context).size.width * 0.30,
                              decoration: const BoxDecoration(
                                color: Color.fromARGB(255, 228, 22, 22),
                              ),
                            ),
                            const SizedBox(height: 10),
                            Expanded(
                                child: Container(
                              width: MediaQuery.of(context).size.width * 0.30,
                              decoration: const BoxDecoration(
                                color: Color.fromARGB(255, 228, 22, 22),
                              ),
                            ))
                          ],
                        ),
                      ),
                    ),
                  ],
                ),
                const SizedBox(
                  height: 20,
                ),
                // Baris ketiga
                Row(
                  children: [
                    Expanded(
                      child: Column(
                        children: [
                          Container(
                            height: 45,
                            width: MediaQuery.of(context).size.width * 0.30,
                            decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 228, 22, 22),
                            ),
                          ),
                          const SizedBox(height: 10),
                          Container(
                            height: 45,
                            width: MediaQuery.of(context).size.width * 0.30,
                            decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 228, 22, 22),
                            ),
                          )
                        ],
                      ),
                    ),
                    Container(
                      margin: const EdgeInsets.only(left: 20, right: 20),
                      height: 100,
                      width: MediaQuery.of(context).size.width * 0.40,
                      decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 6, 145, 209),
                      ),
                    ),
                    Expanded(
                      child: Column(
                        children: [
                          Container(
                            height: 45,
                            width: MediaQuery.of(context).size.width * 0.30,
                            decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 228, 22, 22),
                            ),
                          ),
                          const SizedBox(height: 10),
                          Container(
                            height: 45,
                            width: MediaQuery.of(context).size.width * 0.30,
                            decoration: const BoxDecoration(
                              color: Color.fromARGB(255, 228, 22, 22),
                            ),
                          )
                        ],
                      ),
                    ),
                  ],
                )
              ],
            ),
          ),
        ),
      ),
    );
  }
}
