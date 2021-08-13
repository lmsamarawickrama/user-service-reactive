db.createUser(
    {
        user: "smartbids",
        pwd: "smartbids",
        roles: [
            {
                role: "readWrite",
                db: "smartbids"
            }
        ]
    }
);