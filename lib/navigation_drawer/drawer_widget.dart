import 'package:flutter/material.dart';

class DrawerWidget extends StatelessWidget {
  const DrawerWidget({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        padding: EdgeInsets.zero,
        children: <Widget>[
          _drawerHeader(),
          _drawerItem(text: "Beranda", onTap: () {}, icon: Icons.home),
          const Divider(thickness: 1),
          _drawerItem(text: "Setting", onTap: () {}, icon: Icons.settings),
          const Divider(thickness: 1),
          _drawerItem(text: "Tentang", onTap: () {}, icon: Icons.info),
          const Divider(thickness: 1),
          _drawerItem(text: "Kontak", onTap: () {}, icon: Icons.contact_mail),
          const Divider(thickness: 1),
          const SizedBox(height: 20),
          Center(
            child: ElevatedButton(
              onPressed: () {
                // Navigator.pop(context);
              },
              child: const Text("Keluar"),
            ),
          ),
        ],
      ),
    );
  }

  Widget _drawerHeader() {
    return const UserAccountsDrawerHeader(
      decoration: BoxDecoration(
          color: Colors.blue,
          image: DecorationImage(
              image: AssetImage("assets/images/background.jpg"),
              fit: BoxFit.cover)),
      currentAccountPicture: CircleAvatar(
          backgroundColor: Colors.white,
          backgroundImage: AssetImage("assets/images/user.png")
          // child: Icon(
          //   Icons.person,
          //   color: Colors.black87,
          //   size: 50,
          // ),
          ),
      accountName: Text(
        "JUHARI",
        style: TextStyle(
          fontWeight: FontWeight.w500,
          fontFamily: "Poppins",
          fontSize: 16,
        ),
      ),
      accountEmail: Text(
        'juhariwnly2021@gmail.com',
        style: TextStyle(
          fontWeight: FontWeight.w500,
          fontFamily: "Poppins",
          fontSize: 12,
        ),
      ),
    );
  }

  Widget _drawerItem(
      {required String text,
      required IconData icon,
      required GestureTapCallback onTap}) {
    return SizedBox(
      width: 50,
      height: 50,
      child: ListTile(
        leading: Icon(icon),
        title: Row(
          children: <Widget>[
            Text(
              text,
              style: const TextStyle(
                fontWeight: FontWeight.w500,
                fontFamily: "Poppins",
                fontSize: 20,
              ),
            )
          ],
        ),
        onTap: onTap,
      ),
    );
  }
}
