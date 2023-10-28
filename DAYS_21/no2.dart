import "package:flutter/material.dart";

class Nomor2 extends StatelessWidget {
  const Nomor2({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(),
        body: SingleChildScrollView(
          padding: const EdgeInsets.all(15),
          child: Column(
            children: [
              Row(
                children: [
                  Container(
                    padding: const EdgeInsets.all(15),
                    height: 200,
                    width: MediaQuery.of(context).size.width * 0.60,
                    decoration: const BoxDecoration(color: Colors.blue),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                      children: [
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                height: 200,
                                width: MediaQuery.of(context).size.width * 0.17,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                height: 200,
                                width: MediaQuery.of(context).size.width * 0.17,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                      ],
                    ),
                  ),
                  const SizedBox(
                    width: 15,
                  ),
                  Expanded(
                    child: Container(
                      height: 200,
                      width: MediaQuery.of(context).size.width * 0.60,
                      decoration: const BoxDecoration(
                          color: Color.fromARGB(255, 5, 189, 75)),
                      child: Column(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        children: [
                          Row(
                            children: [
                              Expanded(
                                child: Container(
                                  margin: const EdgeInsets.only(
                                      left: 20, right: 20),
                                  height: 50,
                                  decoration: const BoxDecoration(
                                      color:
                                          Color.fromARGB(255, 190, 176, 176)),
                                ),
                              )
                            ],
                          ),
                          // const SizedBox(
                          //   height: 15,
                          // ),
                          Row(
                            children: [
                              Expanded(
                                child: Container(
                                  margin: const EdgeInsets.only(
                                      left: 20, right: 20),
                                  height: 50,
                                  decoration: const BoxDecoration(
                                      color:
                                          Color.fromARGB(255, 190, 176, 176)),
                                ),
                              )
                            ],
                          )
                        ],
                      ),
                    ),
                  )
                ],
              ),
              const SizedBox(
                height: 15,
              ),
              Row(
                children: [
                  Expanded(
                    child: Container(
                      height: 100,
                      width: 100,
                      decoration: const BoxDecoration(
                          color: Color.fromARGB(255, 190, 176, 176)),
                      child: Container(
                        margin: const EdgeInsets.all(28),
                        decoration: const BoxDecoration(
                            color: Color.fromARGB(255, 5, 189, 75)),
                      ),
                    ),
                  )
                ],
              ),
              const SizedBox(
                height: 15,
              ),
              Row(
                children: [
                  Container(
                    height: 100,
                    width: 100,
                    decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 190, 176, 176)),
                  ),
                  const SizedBox(
                    width: 15,
                  ),
                  Expanded(
                      child: Container(
                    padding: const EdgeInsets.all(15),
                    height: 100,
                    width: 100,
                    decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 190, 176, 176)),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                width: MediaQuery.of(context).size.width * 0.06,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                width: MediaQuery.of(context).size.width * 0.06,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                width: MediaQuery.of(context).size.width * 0.06,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                width: MediaQuery.of(context).size.width * 0.06,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                width: MediaQuery.of(context).size.width * 0.06,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                width: MediaQuery.of(context).size.width * 0.06,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                        Column(
                          children: [
                            Expanded(
                              child: Container(
                                width: MediaQuery.of(context).size.width * 0.06,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 241, 9, 9)),
                              ),
                            )
                          ],
                        ),
                      ],
                    ),
                  ))
                ],
              )
            ],
          ),
        ),
      ),
    );
  }
}
