from django.contrib import admin

from home.models import Contact, Post

# Register your models here.
admin.site.register(Post)
admin.site.register(Contact)