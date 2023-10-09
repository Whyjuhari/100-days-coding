// ignore: file_names
import 'package:flutter/material.dart';
import 'navigation_drawer/drawer_widget.dart';

class ScaffoldWidget extends StatefulWidget {
  const ScaffoldWidget({super.key});

  @override
  State<ScaffoldWidget> createState() => _ScaffoldWidgetState();
}

class _ScaffoldWidgetState extends State<ScaffoldWidget> {
  final GlobalKey<ScaffoldState> _scaffoldKey = GlobalKey<ScaffoldState>();
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        key: _scaffoldKey,
        appBar: AppBar(
          automaticallyImplyLeading: false,
          backgroundColor: Colors.blue,
          title: const Text(
            "FLUTTER WIDGET BASIC",
            style: TextStyle(color: Colors.white),
          ),
          leading: Container(
            child: IconButton(
              onPressed: () {
                _scaffoldKey.currentState!.openDrawer();
              },
              icon: const Icon(Icons.menu),
            ),
          ),
        ),
        body: const Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: <Widget>[
            CardSaya(
                icon: Icons.home,
                text: "Home",
                warnaIcon: Colors.brown,
                paragraf: "Ini adalah icon beranda"),
            CardSaya(
                icon: Icons.favorite,
                text: "Favorite",
                warnaIcon: Colors.pink,
                paragraf: "Ini adalah icon Love"),
            CardSaya(
                icon: Icons.place,
                text: "Palace",
                warnaIcon: Colors.blue,
                paragraf: "Ini adalah icon lokasi"),
            CardSaya(
                icon: Icons.settings,
                text: "Settings",
                warnaIcon: Colors.black87,
                paragraf: "Ini adalah icon pengaturan"),
          ],
        ),
        drawer: const DrawerWidget(),
        bottomNavigationBar: const BottomAppBar(
          padding: EdgeInsets.all(15),
          color: Color.fromARGB(255, 82, 82, 82),
          child: Text(
            "By 💌 Junior Programming",
            textAlign: TextAlign.center,
            style: TextStyle(color: Colors.white),
          ),
        ),
      ),
    );
  }
}

class CardSaya extends StatelessWidget {
  const CardSaya(
      {super.key,
      required this.icon,
      required this.text,
      required this.warnaIcon,
      required this.paragraf});

  final IconData icon;
  final String text;
  final Color warnaIcon;
  final String paragraf;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.all(10),
      child: Card(
          child: Column(
        children: <Widget>[
          Icon(icon, size: 50, color: warnaIcon),
          Text(text, style: const TextStyle(fontSize: 20)),
          Text(paragraf, style: const TextStyle(fontSize: 12))
        ],
      )),
    );
  }
}
