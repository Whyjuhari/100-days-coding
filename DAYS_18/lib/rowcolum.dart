import 'package:flutter/material.dart';

class RowColumn extends StatelessWidget {
  const RowColumn({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text("ROW COLUMN"),
          centerTitle: true,
          backgroundColor: Colors.blue,
        ),
        body: SingleChildScrollView(
            child: Container(
          padding: const EdgeInsets.all(20.0),
          child: Column(
            children: [
              Row(
                children: [
                  Container(
                    height: 100,
                    width: MediaQuery.of(context).size.width * 0.60,
                    decoration: const BoxDecoration(
                      color: Colors.red,
                    ),
                    child: const Center(
                      child: Text(
                        "1.1",
                        style: TextStyle(color: Colors.white, fontSize: 20.0),
                      ),
                    ),
                  ),
                  const SizedBox(
                    width: 20,
                  ),
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 22, 228, 159),
                      ),
                      child: const Center(
                        child: Text(
                          "1.2",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                  const SizedBox(
                    width: 20.0,
                  ),
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 228, 225, 22),
                      ),
                      child: const Center(
                        child: Text(
                          "1.3",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                ],
              ),
              const SizedBox(
                height: 20,
              ),
              Row(
                children: [
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Colors.red,
                      ),
                      child: const Center(
                        child: Text(
                          "2.1",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                  const SizedBox(
                    width: 20,
                  ),
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Colors.yellow,
                      ),
                      child: const Center(
                        child: Text(
                          "2.2",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                  const SizedBox(
                    width: 20,
                  ),
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Colors.blue,
                      ),
                      child: const Center(
                        child: Text(
                          "2.3",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                  const SizedBox(
                    width: 20,
                  ),
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Colors.blue,
                      ),
                      child: const Center(
                        child: Text(
                          "2.4",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                  const SizedBox(
                    width: 20,
                  ),
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 43, 163, 7),
                      ),
                      child: const Center(
                        child: Text(
                          "2.5",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                ],
              ),
              const SizedBox(
                height: 20,
              ),
              Row(
                children: [
                  Expanded(
                    child: Container(
                      height: 100,
                      decoration: const BoxDecoration(
                        color: Color.fromARGB(255, 22, 228, 159),
                      ),
                      child: const Center(
                        child: Text(
                          "3.1",
                          style: TextStyle(color: Colors.white, fontSize: 20.0),
                        ),
                      ),
                    ),
                  ),
                  const SizedBox(
                    width: 20,
                  ),
                  Container(
                    height: 100,
                    padding: const EdgeInsets.all(10),
                    width: MediaQuery.of(context).size.width * 0.47,
                    decoration: const BoxDecoration(
                      color: Colors.red,
                    ),
                    child: Row(
                      children: [
                        // const SizedBox(height: 10),
                        Expanded(
                          child: Column(
                            children: [
                              Container(
                                height: 33,
                                decoration: const BoxDecoration(
                                    color: Color.fromARGB(255, 205, 243, 33)),
                                child: const Center(
                                  child: Text(
                                    "3.2.1",
                                    style: TextStyle(
                                        color: Colors.white, fontSize: 20.0),
                                  ),
                                ),
                              ),
                              const SizedBox(height: 10),
                              Expanded(
                                child: Container(
                                  decoration: const BoxDecoration(
                                      color: Color.fromARGB(255, 205, 243, 33)),
                                  child: const Center(
                                    child: Text(
                                      "3.2.2",
                                      style: TextStyle(
                                          color: Colors.white, fontSize: 20.0),
                                    ),
                                  ),
                                ),
                              )
                            ],
                          ),
                        ),
                        const SizedBox(width: 10.0),
                        Container(
                          height: 100,
                          width: MediaQuery.of(context).size.width * 0.20,
                          decoration: const BoxDecoration(color: Colors.blue),
                          child: const Center(
                            child: Text(
                              "3.2.3",
                              style: TextStyle(
                                  color: Colors.white, fontSize: 20.0),
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                ],
              ),
            ],
          ),
        )),
      ),
    );
  }
}
