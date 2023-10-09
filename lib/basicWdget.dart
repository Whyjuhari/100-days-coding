import "package:flutter/material.dart";

class BasicWidget extends StatefulWidget {
  const BasicWidget({super.key});

  @override
  State<BasicWidget> createState() => _BasicWdgetState();
}

class _BasicWdgetState extends State<BasicWidget> {
  final GlobalKey<ScaffoldState> _scaffoldKey = GlobalKey<ScaffoldState>();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      key: _scaffoldKey,
      appBar: AppBar(
        leading: const Icon(Icons.notification_add),
        title: const Text("Hello World"),
        actions: const [Icon(Icons.not_accessible), Icon(Icons.menu)],
      ),
      body: const Center(child: Text("Ini adalah body")),
      floatingActionButton: FloatingActionButton(onPressed: () {}),
      bottomNavigationBar: const BottomAppBar(child: Icon(Icons.mail)),
      drawer: const Drawer(
        child: Center(
          child: Text("Drawer"),
        ),
      ),
    );
  }
}
